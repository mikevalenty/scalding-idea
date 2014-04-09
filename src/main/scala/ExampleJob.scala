import com.twitter.scalding._

class ExampleJob(args: Args) extends Job(args) {

  val data = Tsv(args("input"),
    ('user_id,
      'timestamp,
      'host,
      'referer,
      'remote_addr,
      'country,
      'browser,
      'user_agent,
      'cookie,
      'connection,
      'accept_encoding,
      'accept_language)).read

  data
    .map('country -> 'country) { c: String => if (c == "us") c else "other" }
    .groupBy('browser, 'country) { _.size('count) }
    .groupBy('browser) { _.pivot(('country, 'count) ->('us, 'other)) }
    .write(Tsv("output"))

}
