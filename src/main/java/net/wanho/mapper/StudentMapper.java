package net.wanho.mapper;

import net.wanho.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by syzda on 2019/4/18.
 */


public interface StudentMapper {

    List<Student> geyAllstu();


}
