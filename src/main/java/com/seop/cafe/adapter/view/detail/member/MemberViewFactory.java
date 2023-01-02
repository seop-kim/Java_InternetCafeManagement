package com.seop.cafe.adapter.view.detail.member;

import com.seop.cafe.adapter.view.Viewable;
import java.util.HashMap;
import java.util.Map;

public class MemberViewFactory {
    private final Map<String, Viewable> views = new HashMap<>();
    private static final MemberViewFactory instance = new MemberViewFactory();

    public static MemberViewFactory getInstance() {
        return instance;
    }

    private MemberViewFactory() {
        views.put("regi", new MemberRegisterView());
        views.put("searchMembers", new MemberSearchView());
        views.put("searchNameMembers", new MemberNameSearchView());
        views.put("searchMember", new MemberOneSearchView());
        views.put("delete", new MemberDeleteView());
        views.put("end", new MemberEndView());
    }

    public Viewable get(String viewPath) {
        return views.get(viewPath);
    }

}
