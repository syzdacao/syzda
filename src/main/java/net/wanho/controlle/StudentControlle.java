package net.wanho.controlle;

import net.wanho.pojo.JsonResult;
import net.wanho.pojo.Student;
import net.wanho.service.StudentServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by syzda on 2019/4/18.
 */

@Controller
public class StudentControlle {

    @Autowired
    private StudentServiceI studentServiceI;



    @RequestMapping("getAllStu")
    @ResponseBody
    public JsonResult getAllStu(){
        List<Student> students = studentServiceI.geyAllstu();
        JsonResult jsonResult= new JsonResult(200,"ok",students);
        return jsonResult;
    }





}
