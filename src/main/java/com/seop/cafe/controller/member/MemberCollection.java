package com.seop.cafe.controller.member;

import com.seop.cafe.controller.common.EndFunction;
import com.seop.cafe.function.member.MemberSelectForm;
import com.seop.cafe.function.member.delete.MemberDeleteForm;
import com.seop.cafe.function.member.delete.MemberDeleteFunction;
import com.seop.cafe.function.member.find.MemberFindAllFunction;
import com.seop.cafe.function.member.find.MemberFindNameFunction;
import com.seop.cafe.function.member.find.MemberNameFindForm;
import com.seop.cafe.function.member.regist.MemberRegisterForm;
import com.seop.cafe.function.member.regist.MemberRegisterFunction;
import com.seop.cafe.function.member.update.MemberUpdateFindCompForm;
import com.seop.cafe.function.member.update.MemberUpdateFindForm;
import com.seop.cafe.function.member.update.MemberUpdateFunction;
import com.seop.cafe.function.member.update.MemberUpdateSelectHeadForm;

public enum MemberCollection {
    MEMBER_SELECT_REGISTER("1", new MemberRegisterForm()),
    MEMBER_SELECT_FIND_ALL("2", new MemberFindAllFunction()),
    MEMBER_SELECT_FIND_NAME("3", new MemberNameFindForm()),
    MEMBER_SELECT_UPDATE("4", new MemberUpdateFindForm()),
    MEMBER_SELECT_DELETE("5", new MemberDeleteForm()),
    MEMBER_SELECT_BACK("0", new EndFunction()),

    MEMBER_SELECT_FORM("MEMBER_SELECT_FORM", new MemberSelectForm()),
    MEMBER_REGISTER_FUNCTION("MEMBER_REGI_FUNCTION", new MemberRegisterFunction()),
    MEMBER_FIND_NAME_FUNCTION("MEMBER_SEARCH_NAME_FUNCTION", new MemberFindNameFunction()),
    MEMBER_DELETE_FUNCTION("MEMBER_DELETE_FUNCTION", new MemberDeleteFunction()),
    MEMBER_UPDATE_FIND_COMP_FORM("MEMBER_UPDATE_FIND_COMP_FORM", new MemberUpdateFindCompForm()),
    MEMBER_UPDATE_SELECT_HEAD("MEMBER_UPDATE_SELECT_HEAD", new MemberUpdateSelectHeadForm()),
    MEMBER_UPDATE_FUNCTION("MEMBER_UPDATE_FUNCTION", new MemberUpdateFunction());

    private final String path;
    private final Object function;


    MemberCollection(String path, Object function) {
        this.path = path;
        this.function = function;
    }

    public static Object getFunction(String path) {
        for (MemberCollection controller : values()) {
            if (controller.path.equals(path)) {
                return controller.function;
            }
        }
        throw new IllegalArgumentException("[MemberController] 찾는 기능이 없습니다.");
    }
}
