package com.huiyouhui.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/10/19.
 */
public class asdas {


    /**
     * status : 10028
     * msg : 获取数据成功
     * data : [{"ci_id":"844","ci_name":"石岐街道"},{"ci_id":"845","ci_name":"东区街道"},{"ci_id":"846","ci_name":"西区街道"},{"ci_id":"847","ci_name":"环城街道"},{"ci_id":"848","ci_name":"中山港街道"},{"ci_id":"849","ci_name":"五桂山街道"}]
     */

    public int status;
    public String msg;
    /**
     * ci_id : 844
     * ci_name : 石岐街道
     */

    public List<DataBean> data;

    public static class DataBean {
        public String ci_id;
        public String ci_name;
    }
}
