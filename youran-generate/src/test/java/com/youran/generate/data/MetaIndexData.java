package com.youran.generate.data;

import com.google.common.base.Joiner;
import com.youran.common.util.SafeUtil;
import com.youran.generate.pojo.dto.MetaIndexAddDTO;
import com.youran.generate.pojo.dto.MetaIndexUpdateDTO;
import com.youran.generate.pojo.po.MetaIndexPO;

import static com.youran.generate.pojo.example.MetaIndexExample.*;

/**
 * Title:测试数据
 * Description:
 * Author: cbb
 * Create Time:2017/5/12 15:21
 */
public class MetaIndexData {

    /**
     * 生成add测试数据
     * @return
     */
    public static MetaIndexAddDTO getAddDTO(Integer... fieldIds){
        MetaIndexAddDTO dto = new MetaIndexAddDTO();
        dto.setIndexName(E_INDEXNAME);
        dto.setUnique(SafeUtil.getInteger(E_UNIQUE));
        dto.setFieldIds(Joiner.on(",").join(fieldIds));
        dto.setEntityId(SafeUtil.getInteger(E_ENTITYID));
        return dto;
    }


    /**
     * 生成update测试数据
     * @return
     */
    public static MetaIndexUpdateDTO getUpdateDTO(MetaIndexPO metaIndex, Integer... fieldIds){
        MetaIndexUpdateDTO metaIndexUpdateDTO= new MetaIndexUpdateDTO();
        metaIndexUpdateDTO.setIndexId(metaIndex.getIndexId());
        metaIndexUpdateDTO.setIndexName(metaIndex.getIndexName());
        metaIndexUpdateDTO.setEntityId(metaIndex.getEntityId());
        metaIndexUpdateDTO.setUnique(metaIndex.getUnique());
        metaIndexUpdateDTO.setFieldIds(Joiner.on(",").join(fieldIds));
        return metaIndexUpdateDTO;
    }

}