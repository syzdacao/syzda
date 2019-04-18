package net.wanho.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by syzda on 2019/4/15.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

private Integer id;
private String name;
private Integer password;
private Integer age;
private String sex;
private String hobby;


}
