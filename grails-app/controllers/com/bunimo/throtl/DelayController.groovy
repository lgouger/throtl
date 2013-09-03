package com.bunimo.throtl

class DelayController {

    public static final Long MILLISECONDS_PER_SECOND = 1000
    public static final Long MILLISECONDS_PER_TENTH = 100
    public static final Long SECONDS_PER_MINUTE = 60

    static defaultAction = "milliseconds"

    def milliseconds() {
        Long sleepTime = idAsLong(params.id) ?: 1000;

        sleepAndGo(sleepTime, params.url)
    }

    def tenths() {
        Long SleepTenths = idAsLong(params.id) ?: 10

        sleepAndGo(SleepTenths * MILLISECONDS_PER_TENTH, params.url)
    }

    def seconds() {
        Long sleepSeconds = idAsLong(params.id) ?: 1

        sleepAndGo(sleepSeconds * MILLISECONDS_PER_SECOND, params.url)
    }

    def minutes() {
        Long sleepMinutes = idAsLong(params.id) ?: 1

        sleepAndGo(sleepMinutes * SECONDS_PER_MINUTE * MILLISECONDS_PER_SECOND, params.url)
    }

    private Long idAsLong(String arg) {
        if (arg == null)  return null

        if (arg.isLong()) {
            return arg.toLong()
        }

        return null
    }

    private void sleepAndGo ( Long msSleepTime, String url ) {
        log.debug("sleeping for " + msSleepTime + " milliseconds.")
        sleep(msSleepTime)

        if (url != null) {
            redirect(url: url)
        } else {
            render(view: "/index")
        }
    }

}