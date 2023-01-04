package com.seop.cafe.view;

import com.seop.cafe.view.common.EndView;
import com.seop.cafe.view.item.ItemAddView;
import com.seop.cafe.view.item.ItemSearchCategoryView;
import com.seop.cafe.view.item.ItemDeleteView;
import com.seop.cafe.view.item.ItemNameSearchView;
import com.seop.cafe.view.item.ItemSearchView;
import com.seop.cafe.view.item.ItemUpdateView;
import com.seop.cafe.view.member.MemberDeleteView;
import com.seop.cafe.view.member.MemberNameSearchView;
import com.seop.cafe.view.member.MemberOneSearchView;
import com.seop.cafe.view.member.MemberRegisterView;
import com.seop.cafe.view.member.MemberSearchView;
import java.util.HashMap;
import java.util.Map;

public class ViewFactory {
    private final Map<String, Viewable> views = new HashMap<>();
    private static final ViewFactory instance = new ViewFactory();

    public static ViewFactory getInstance() {
        return instance;
    }

    private ViewFactory() {
        initMember();
        initItem();
        views.put("end", new EndView());
    }

    private void initMember() {
        views.put("memberRegi", new MemberRegisterView());
        views.put("memberSearchMembers", new MemberSearchView());
        views.put("memberSearchNameMembers", new MemberNameSearchView());
        views.put("memberSearchMember", new MemberOneSearchView());
        views.put("memberDelete", new MemberDeleteView());
    }

    private void initItem() {
        views.put("itemAdd", new ItemAddView());
        views.put("itemDelete", new ItemDeleteView());
        views.put("itemSearchName", new ItemNameSearchView());
        views.put("itemSearchItems", new ItemSearchView());
        views.put("itemUpdate", new ItemUpdateView());
        views.put("itemCategorySearch", new ItemSearchCategoryView());

    }

    public Viewable get(String viewPath) {
        return views.get(viewPath);
    }
}
