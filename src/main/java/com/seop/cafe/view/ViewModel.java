package com.seop.cafe.view;

import java.util.HashMap;
import java.util.Map;

public class ViewModel {
    private final String viewPath;
    private final Map<String, Object> model;

    public ViewModel(String viewPath) {
        this.viewPath = viewPath;
        this.model = new HashMap<>();
    }

    public ViewModel(String viewPath, Map<String, Object> model) {
        this.viewPath = viewPath;
        this.model = model;
    }

    public void add(String key, Object object) {
        model.put(key, object);
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void render() {
        ViewFactory viewFactory = ViewFactory.getInstance();
        Viewable viewable = viewFactory.get(viewPath);
        viewable.render(model);
    }
}
