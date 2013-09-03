class UrlMappings {

	static mappings = {
        "/ms/$id?"(controller: "delay", action: "milliseconds" )
        "/milli/$id?"(controller: "delay", action: "milliseconds" )
        "/millis/$id?"(controller: "delay", action: "milliseconds" )
        "/millisecond/$id?"(controller: "delay", action: "milliseconds" )
        "/milliseconds/$id?"(controller: "delay", action: "milliseconds" )
        "/$id/ms"(controller: "delay", action: "milliseconds" )
        "/$id/milli"(controller: "delay", action: "milliseconds" )
        "/$id/millis"(controller: "delay", action: "milliseconds" )
        "/$id/millisecond"(controller: "delay", action: "milliseconds" )
        "/$id/milliseconds"(controller: "delay", action: "milliseconds" )
        "/delay/ms/$id?"(controller: "delay", action: "milliseconds" )
        "/delay/milli/$id?"(controller: "delay", action: "milliseconds" )
        "/delay/millis/$id?"(controller: "delay", action: "milliseconds" )
        "/delay/millisecond/$id?"(controller: "delay", action: "milliseconds" )
        "/delay/$id/ms"(controller: "delay", action: "milliseconds" )
        "/delay/$id/milli"(controller: "delay", action: "milliseconds" )
        "/delay/$id/millis"(controller: "delay", action: "milliseconds" )
        "/delay/$id/millisecond"(controller: "delay", action: "milliseconds" )

        "/s/$id?"(controller: "delay", action: "seconds" )
        "/sec/$id?"(controller: "delay", action: "seconds" )
        "/secs/$id?"(controller: "delay", action: "seconds" )
        "/second/$id?"(controller: "delay", action: "seconds" )
        "/seconds/$id?"(controller: "delay", action: "seconds" )
        "/$id/s"(controller: "delay", action: "seconds" )
        "/$id/sec"(controller: "delay", action: "seconds" )
        "/$id/secs"(controller: "delay", action: "seconds" )
        "/$id/second"(controller: "delay", action: "seconds" )
        "/$id/seconds"(controller: "delay", action: "seconds" )
        "/delay/s/$id?"(controller: "delay", action: "seconds" )
        "/delay/sec/$id?"(controller: "delay", action: "seconds" )
        "/delay/secs/$id?"(controller: "delay", action: "seconds" )
        "/delay/second/$id?"(controller: "delay", action: "seconds" )
        "/delay/$id/s"(controller: "delay", action: "seconds" )
        "/delay/$id/sec"(controller: "delay", action: "seconds" )
        "/delay/$id/secs"(controller: "delay", action: "seconds" )
        "/delay/$id/second"(controller: "delay", action: "seconds" )

        // for now m is too ambiguous is it minutes of milliseconds?
        // "/m/$id?"(controller: "delay", action: "minutes" )
        "/min/$id?"(controller: "delay", action: "minutes" )
        "/mins/$id?"(controller: "delay", action: "minutes" )
        "/minute/$id?"(controller: "delay", action: "minutes" )
        "/minutes/$id?"(controller: "delay", action: "minutes" )
        "/$id/min"(controller: "delay", action: "minutes" )
        "/$id/mins"(controller: "delay", action: "minutes" )
        "/$id/minute"(controller: "delay", action: "minutes" )
        "/$id/minutes"(controller: "delay", action: "minutes" )
        // "/delay/m/$id?"(controller: "delay", action: "minutes" )
        "/delay/min/$id?"(controller: "delay", action: "minutes" )
        "/delay/mins/$id?"(controller: "delay", action: "minutes" )
        "/delay/minute/$id?"(controller: "delay", action: "minutes" )
        "/delay/$id/min"(controller: "delay", action: "minutes" )
        "/delay/$id/mins"(controller: "delay", action: "minutes" )
        "/delay/$id/minute"(controller: "delay", action: "minutes" )
        "/delay/$id/minutes"(controller: "delay", action: "minutes" )

        "/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
