package com.nocdy.springcloud.entites;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author Nocdy
 * 创建数据库payment实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@TableName(value = "payment")
public class Payment implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    Long id;

    @TableField(value = "serial")
    String serial;

}
