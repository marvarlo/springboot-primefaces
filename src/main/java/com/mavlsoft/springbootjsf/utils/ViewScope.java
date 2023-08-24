package com.mavlsoft.springbootjsf.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jakarta.faces.context.FacesContext;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

/**
 * Adds a Custom "view" scope for JSF in Spring Framework.
 */
public class ViewScope implements Scope {
    private Map<String, Runnable> destructionCallbacks = Collections.synchronizedMap(new HashMap<String, Runnable>());
    public final static String VIEW = "view";

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Map<String, Object> viewMap = FacesContext.getCurrentInstance().getViewRoot().getViewMap();
        if (viewMap.containsKey(name)) {
            return viewMap.get(name);
        } else {
            Object object = objectFactory.getObject();
            viewMap.put(name, object);
            return object;
        }
    }

    @Override
    public Object remove(String name) {
        return FacesContext.getCurrentInstance().getViewRoot().getViewMap().remove(name);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        destructionCallbacks.put(name, callback);
    }

    @Override
    public Object resolveContextualObject(String key) {
        return FacesContext.getCurrentInstance().getViewRoot().getViewMap().get(key);
    }

    @Override
    public String getConversationId() {
        return FacesContext.getCurrentInstance().getViewRoot().getId();
    }

}
