package com.seop.cafe.view.common;

import com.seop.cafe.controller.IMainControllable;
import com.seop.cafe.controller.product.ProductController;
import com.seop.cafe.controller.member.MemberController;
import java.util.HashMap;
import java.util.Map;

public abstract class ViewForm {
    private final Map<String, Object> controllable = new HashMap<>();
    protected Map<String, Object> ANSWER_MODEL = new HashMap<>();
    protected String VIEW_FORM_TEXT;
    protected String KEY;
    protected String CONTROLLER;
    protected String CONTROLLER_PATH;

    protected ViewForm() {
        controllable.put("MEMBER", new MemberController());
        controllable.put("PRODUCT", new ProductController());
    }

    protected final void print() {
        System.out.print(VIEW_FORM_TEXT);
    }

    protected final void print(Object msg) {
        System.out.print(msg);
    }

    protected final void read(String read) {
        ANSWER_MODEL.put(KEY, read);
    }

    protected final void add(String key, Object value) {
        ANSWER_MODEL.put(key, value);
    }

    protected final void mapping(String key) {
        IMainControllable controller = (IMainControllable) controllable.get(CONTROLLER);
        controller.mapping(key);
    }
    protected final void mapping() {
        IMainControllable controller = (IMainControllable) controllable.get(CONTROLLER);
        controller.mapping(CONTROLLER_PATH, ANSWER_MODEL);
    }

    /**
     * setup MEMBER_VIEW_TEXT & KEY & CONTROLLER & PATH
     */
    protected void setup() {
    }
}
