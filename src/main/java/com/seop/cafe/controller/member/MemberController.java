package com.seop.cafe.controller.member;

import com.seop.cafe.adapter.Adapter;
import com.seop.cafe.adapter.IAdapter;
import com.seop.cafe.controller.common.EndFunction;
import com.seop.cafe.controller.IMainControllable;
import com.seop.cafe.function.member.delete.MemberDeleteFunction;
import com.seop.cafe.function.member.find.MemberFindNameFunction;
import com.seop.cafe.function.member.regist.MemberRegisterFunction;
import com.seop.cafe.function.member.find.MemberFindAllFunction;
import com.seop.cafe.function.member.update.MemberUpdateFunction;
import com.seop.cafe.function.member.delete.MemberDeleteForm;
import com.seop.cafe.function.member.find.MemberNameFindForm;
import com.seop.cafe.function.member.update.MemberUpdateFindCompForm;
import com.seop.cafe.function.member.update.MemberUpdateFindForm;
import com.seop.cafe.function.member.update.MemberUpdateSelectHeadForm;
import com.seop.cafe.view.common.InputView;
import com.seop.cafe.view.ViewModel;
import java.util.HashMap;
import java.util.Map;

public class MemberController implements IMainControllable {
    private static final Map<String, Object> controllers = new HashMap<>();
    private static final Adapter adapters = Adapter.getInstance();
    private static final String END = "0";
    private static final String SELECT_MEMBER_MENU = "1 회원등록\t2 전체조회\t3 이름 조회\t4 회원 수정\t5 회원 삭제\t" + END + " 뒤로";
    private static final String CONTOUR = "======================================================================";

    public MemberController() {
        initSelectController();
        initFunctionController();
        controllers.put(END, new EndFunction());
    }


    private void initSelectController() {
        controllers.put("1", new MemberRegisterFunction());
        controllers.put("2", new MemberFindAllFunction());
        controllers.put("3", new MemberNameFindForm());
        controllers.put("4", new MemberUpdateFindForm());
        controllers.put("5", new MemberDeleteForm());
    }

    private void initFunctionController() {
        controllers.put("MEMBER_SEARCH_NAME_FUNCTION", new MemberFindNameFunction());
        controllers.put("MEMBER_DELETE_FUNCTION", new MemberDeleteFunction());
        controllers.put("MEMBER_UPDATE_FIND_COMP_FORM", new MemberUpdateFindCompForm());
        controllers.put("MEMBER_UPDATE_SELECT_HEAD", new MemberUpdateSelectHeadForm());
        controllers.put("MEMBER_UPDATE_FUNCTION", new MemberUpdateFunction());
    }


    public void process() {
        MemberController controller = new MemberController();

        String select = "9999";
        while (!select.equals(END)) {
            System.out.println(CONTOUR + "\n" + SELECT_MEMBER_MENU + "\n" + CONTOUR);
            select = InputView.read();
            controller.mapping(select);
        }
    }

    public void mapping(String path) {
        Object controller = controllers.get(path);
        IAdapter adapter = adapters.findAdapter(controller);
        ViewModel viewModel = adapter.process(controller);
        viewModel.render();
    }

    @Override
    public void mapping(String path, Map<String, Object> model) {
        Object controller = controllers.get(path);
        IAdapter adapter = adapters.findAdapter(controller);
        ViewModel viewModel = adapter.process(controller, model);
        viewModel.render();
    }
}
