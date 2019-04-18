package net.wanho.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by syzda on 2019/4/16.
 */
public class MybatisUntil {
    private static SqlSessionFactory sf;
    private static ThreadLocal<SqlSession> threadLocal;

    static {
        threadLocal = new ThreadLocal<SqlSession>();
        InputStream inputstream = MybatisUntil.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        sf = new SqlSessionFactoryBuilder().build(inputstream);
    }

    public static SqlSession getSession() {

        SqlSession sqlSession = threadLocal.get();
        if (sqlSession == null) {
            sqlSession = sf.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }

    public static void closeSession() {
        SqlSession sqlSession = threadLocal.get();
        if (sqlSession != null) {
            sqlSession.close();
            threadLocal.remove();
        }
    }


}
