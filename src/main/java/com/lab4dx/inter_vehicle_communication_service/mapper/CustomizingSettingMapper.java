package com.lab4dx.inter_vehicle_communication_service.mapper;


import com.lab4dx.inter_vehicle_communication_service.dto.CustomizingSetting;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;


@Mapper
public interface CustomizingSettingMapper {
    CustomizingSetting getSettingByMemberAndEmoji(String memberId, String emojiId);  // int -> String
    List<CustomizingSetting> getSettingByMember(String memberId);
    void insertSetting(CustomizingSetting setting);
    void updateSetting(CustomizingSetting setting);
    int updateIconSetting(CustomizingSetting setting);
    CustomizingSetting getSettingByIdAndMemberId(String customizingId, String memberId);
}
