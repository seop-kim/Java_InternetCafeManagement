package com.seop.cafe.adapter;

import com.seop.cafe.view.ViewModel;
import java.util.Map;

public interface IAdapter {
    boolean isSupport(Object controller);

    ViewModel process(Object controller);

    /**
     * 뷰 -> 컨트롤러 데이터 전달을 위한 default method
     *
     * @param controller
     * @param model
     */
    default ViewModel process(Object controller, Map<String, Object> model) {
        return null;
    }
}
