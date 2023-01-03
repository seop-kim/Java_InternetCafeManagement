package com.seop.cafe.view.member;

import com.seop.cafe.view.Viewable;
import java.util.HashMap;
import java.util.Map;

public class MemberViewModel {
    private final String viewPath;
    private final Map<String, Object> model;

    public MemberViewModel(String viewPath) {
        this.viewPath = viewPath;
        this.model = new HashMap<>();
    }

    public MemberViewModel(String viewPath, Map<String, Object> model) {
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
        MemberViewFactory viewFactory = MemberViewFactory.getInstance();
        Viewable viewable = viewFactory.get(viewPath);
        viewable.render(model);
    }
}
