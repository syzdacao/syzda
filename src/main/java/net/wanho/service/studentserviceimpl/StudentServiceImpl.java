package net.wanho.service.studentserviceimpl;

import net.wanho.mapper.StudentMapper;
import net.wanho.pojo.Student;
import net.wanho.service.StudentServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by syzda on 2019/4/18.
 */
@Service
public class StudentServiceImpl implements StudentServiceI {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> geyAllstu() {
        return studentMapper.geyAllstu();
    }
}
