package com.youran.generate.pojo.mapper;

import com.youran.generate.pojo.dto.MetaProjectAddDTO;
import com.youran.generate.pojo.dto.MetaProjectUpdateDTO;
import com.youran.generate.pojo.po.MetaProjectPO;
import com.youran.generate.pojo.vo.MetaProjectShowVO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * Title: 元数据项目映射
 * Description: 基于mapstruct来实现，编译器自动生成实现类
 * Author: cbb
 * Create Time:2017/5/24
 */
@Mapper
public interface MetaProjectMapper {

    MetaProjectMapper INSTANCE = Mappers.getMapper( MetaProjectMapper.class );

    /**
     * addDTO映射po
     * @param addDTO
     * @return
     */
    MetaProjectPO fromAddDTO(MetaProjectAddDTO addDTO);

    /**
     * 将updateDTO中的值设置到po
     * @param metaProjectPO
     * @param metaProjectUpdateDTO
     */
    void setPO(@MappingTarget MetaProjectPO metaProjectPO, MetaProjectUpdateDTO metaProjectUpdateDTO);

    /**
     * po映射showVO
     * @param metaProjectPO
     * @return
     */
    MetaProjectShowVO toShowVO(MetaProjectPO metaProjectPO);
}