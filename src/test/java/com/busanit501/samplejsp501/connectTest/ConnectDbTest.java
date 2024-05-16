package com.busanit501.samplejsp501.connectTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDbTest {
    @Test
    public void test(){
        int v1=100;
        int v2=100;
        Assertions.assertEquals(v1,v2);

    }
    @Test
    public void connectTestDb()throws Exception{
        // 예외를 처리하는 방법2가지,
        // 1) try catch finally 구문 이용.
        // 2) throws 를 키워드를 이용해서, 해당 예외를 떠넘기기.
        // 3) 언제 예외 처리를 하는냐? a) 파일 입출력 b) 네트워크 이용해서 데이터 전달시.

        // jdbc 드라이버 로드,
        Class.forName("org.mariadb.jdbc.Driver");

        // 커넥션 연결 인스턴스 필요.
        Connection conn = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/webdb",
                "webuser",
                "webuser"
        );
        // 단순 conn 인스턴스 존재 유무로, 드라이버 설치 유무 확인.
        Assertions.assertNotNull(conn);

        // sql 문 전달. -> 잠시 대기
        // 자원 반납.
        conn.close();
    }
}
