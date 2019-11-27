package com.wd.starter.swaggerspringbootstarter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: He Zhigang
 * @Date: 2019/11/27 14:00
 * @Description:
 */
@ApiModel
@Data
public class PageParam {

    @ApiModelProperty("第page页,从0开始计数")
    private Integer page;

    @ApiModelProperty("每页数据数量")
    private Integer size;

    @ApiModelProperty("按属性排序,格式:属性(,asc|desc)")
    private List<String> sort;

}
