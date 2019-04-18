package net.wanho.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by syzda on 2019/4/18.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult {


    private Integer num;
    private String msg;
    private Object date;


}
