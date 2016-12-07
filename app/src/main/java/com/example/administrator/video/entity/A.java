package com.example.administrator.video.entity;

import java.util.Arrays;

/**
 * 实体类1
 * Created by Administrator on 2016/12/7.
 */
public class A {

        private int status;
        //参数名称   状态值
              //    10001 请求成功
              //    30001非法操作
              //    30002 参数有误
             //    30003 参数有误
            //    30004 参数有误
            //    30005 未查到数据
        private B[] msg;

        public int getStatus() {
                return status;
        }

        public void setStatus(int status) {
                this.status = status;
        }

        public B[] getMsg() {
                return msg;
        }


        public void setMsg(B[] msg) {
                this.msg = msg;
        }

        @Override
        public String toString() {
                return "A{" +
                        "status=" + status +
                        ", msg=" + Arrays.toString(msg) +
                        '}';
        }

}
