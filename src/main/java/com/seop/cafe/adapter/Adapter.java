package com.seop.cafe.adapter;

import java.util.ArrayList;
import java.util.List;

public class Adapter {
    private static final String ADAPTER_NO_SEARCH_EXCEPTION_MSG = "일치하는 어댑터를 찾을 수 없습니다.";
    private static final List<IAdapter> adapters = new ArrayList<>();
    private static final Adapter instance = new Adapter();

    public static Adapter getInstance() {
        return instance;
    }

    private Adapter() {
        adapters.add(new AdapterMap());
        adapters.add(new AdapterString());
    }

    public IAdapter findAdapter(Object controller) {
        for (IAdapter adapter : adapters) {
            if (adapter.isSupport(controller)) {
                return adapter;
            }
        }
        throw new IllegalArgumentException(ADAPTER_NO_SEARCH_EXCEPTION_MSG);
    }
}
