package com.ati.anim4j.timelinemax.client;

import com.ati.anim4j.core.client.SimpleTimeLine;
import com.google.gwt.core.client.JavaScriptObject;

public class TimelineMax extends SimpleTimeLine {

    public TimelineMax() {
        jsObj = createNativePeer();
    }

    private native JavaScriptObject createNativePeer()/*-{
		return new $wnd.TimelineMax();
    }-*/;

    public native <T extends SimpleTimeLine> T reverseTimeLine()/*-{
		var peer = this.@com.ati.anim4j.core.client.JsObject::getJsObj()();
		peer.reverse();
		return this
    }-*/;

}
