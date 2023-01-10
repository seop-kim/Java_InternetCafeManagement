package com.seop.cafe.view;

import com.seop.cafe.view.common.EndView;
import com.seop.cafe.view.item.ItemAddView;
import com.seop.cafe.view.item.ItemSearchCategoryView;
import com.seop.cafe.view.item.ItemDeleteView;
import com.seop.cafe.view.item.ItemNameSearchView;
import com.seop.cafe.view.item.ItemSearchView;
import com.seop.cafe.view.item.ItemUpdateView;
import com.seop.cafe.view.member.MemberSelectForm;
import com.seop.cafe.view.member.delete.MemberDeleteView;
import com.seop.cafe.view.member.find.MemberNameSearchView;
import com.seop.cafe.view.member.regist.MemberRegisterFormView;
import com.seop.cafe.view.member.regist.MemberRegisterView;
import com.seop.cafe.view.member.find.MemberSearchView;
import com.seop.cafe.view.member.update.MemberUpdateCompView;
import com.seop.cafe.view.member.delete.MemberDeleteFormView;
import com.seop.cafe.view.member.find.MemberNameSearchFormView;
import com.seop.cafe.view.member.update.MemberUpdateFindFormView;
import com.seop.cafe.view.member.update.MemberUpdateFindCompFormView;
import com.seop.cafe.view.member.update.MemberUpdateForm;
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
        initMemberForm();
        initItem();
        views.put("END", new EndView());
    }

    private void initMember() {
        views.put("MEMBER_SELECT_FORM", new MemberSelectForm());
        views.put("MEMBER_REGI_FORM", new MemberRegisterFormView());
        views.put("MEMBER_REGI_COMP", new MemberRegisterView());
        views.put("memberSearchMembers", new MemberSearchView());
        views.put("MEMBER_SEARCH_NAME_VIEW", new MemberNameSearchView());
        views.put("MEMBER_DELETE_VIEW", new MemberDeleteView());

    }

    private void initMemberForm() {
        views.put("MEMBER_DELETE_SELECT_FORM", new MemberDeleteFormView());
        views.put("MEMBER_SEARCH_NAME_FORM", new MemberNameSearchFormView());
        views.put("MEMBER_UPDATE_FIND_FORM", new MemberUpdateFindFormView());
        views.put("MEMBER_UPDATE_FIND_COMP_FORM", new MemberUpdateFindCompFormView());
        views.put("MEMBER_UPDATE_FORM", new MemberUpdateForm());
        views.put("MEMBER_UPDATE_COMP_FORM", new MemberUpdateCompView());
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
