package com.ait.anim4j.core.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class for representing a native JavaScript class.
 * 
 * <b>Note: For internal use only.</b>
 */
public abstract class JsObject {

    protected JavaScriptObject jsObj;

    protected JsObject() {
    }

    protected JsObject(JavaScriptObject jsObj) {
        this.jsObj = jsObj;
    }

    protected boolean isCreated() {
        return jsObj != null;
    }

    public JavaScriptObject getJsObj() {
        JsoHelper.cleanObjectId(jsObj);
        return jsObj;
    }

    protected void setJsObj(JavaScriptObject jsObj) {
        this.jsObj = jsObj;
    }

    public native String[] getProperties() /*-{
		var jsObj = this.@com.ait.anim4j.core.client.JsObject::getJsObj()();
		return @com.ait.anim4j.core.client.JsoHelper::getProperties(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj);
    }-*/;

}
