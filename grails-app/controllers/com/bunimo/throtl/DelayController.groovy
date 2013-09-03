package com.bunimo.throtl

class DelayController {

    public static final Long MILLISECONDS_PER_SECOND = 1000
    public static final Long MILLISECONDS_PER_TENTH = 100
    public static final Long SECONDS_PER_MINUTE = 60

    static defaultAction = "milliseconds"

    def milliseconds() {
        Long sleepTime = idAsLong(params.id) ?: 1000;

        sleepAndGo(sleepTime)
    }

    def tenths() {
        Long SleepTenths = idAsLong(params.id) ?: 10

        sleepAndGo(SleepTenths * MILLISECONDS_PER_TENTH)
    }

    def seconds() {
        Long sleepSeconds = idAsLong(params.id) ?: 1

        sleepAndGo(sleepSeconds * MILLISECONDS_PER_SECOND)
    }

    def minutes() {
        Long sleepMinutes = idAsLong(params.id) ?: 1

        sleepAndGo(sleepMinutes * SECONDS_PER_MINUTE * MILLISECONDS_PER_SECOND)
    }

    private Long idAsLong(String arg) {
        if (arg == null)  return null

        if (arg.isLong()) {
            return arg.toLong()
        }

        return null
    }

    private void sleepAndGo ( Long msSleepTime ) {
        log.debug("sleeping for " + msSleepTime + " milliseconds.")
        sleep(msSleepTime)

        render(view: "/index")
    }

}