package com.eemi.anim4j.timelinemax.client;

import com.eemi.anim4j.core.client.SimpleTimeLine;
import com.google.gwt.core.client.JavaScriptObject;

public class TimelineMax extends SimpleTimeLine {

    public TimelineMax() {
        jsObj = createNativePeer();
    }

    private native JavaScriptObject createNativePeer()/*-{
		return new $wnd.TimelineMax();
    }-*/;

}
