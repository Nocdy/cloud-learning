package com.nocdy.springcloud.entites;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


/**
 * @author
 * 创建JsonResult通用类，用于返回json数据给前端
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CommonResult<T> {

    private Integer cdoe;
    private String message;
    private  T data;

    /**
     * data为null时调用的构造方法
     * @param cdoe 状态码
     * @param message 信息
     */
    public CommonResult(Integer cdoe,String message){
        this(cdoe,message,null);
    }
}
