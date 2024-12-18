package com.zpx.phone.pojo;

import lombok.Data;
import org.springframework.http.StreamingHttpOutputMessage;

import java.util.Arrays;

@Data
public class RabbitMQMessqge {

    private int mapType;
    private String imageUrl;
    private String labelBarcode;
    private int pictureType;
    private String template;
    private String layoutSize;
    private String accountId;
    private String materialName;
    private String imd;
    private String modelName;
    private String sourceModelName;
    private String colorName;
    private String pictureName;
    private int companyId;
    private String configFileName;
    private int configType;
    private boolean avoidHole;
    private String holePosition;
    private String distributorImageCode;
    private String supplierName;
    private String supplierId;
    private String filePath;
    private int materialId;
    private String positionName;
    private String giftIds;
    private boolean needPicture;
    private String frameworkImage;
    private String frameworkType;
    private String frameworkImagePath;
    private String materialImagePath;
    private int setOfPictureType;
    private String giftCode;
    private int setMode;
    private String productionImagePath;
    private String[] customContentTextArr;
    private String imageFormat;
    private String formatSuffix;

    @Override
    public String toString() {
        return "RabbitMQMessqge{" +
                "mapType=" + mapType +
                ", imageUrl='" + imageUrl + '\'' +
                ", labelBarcode='" + labelBarcode + '\'' +
                ", pictureType=" + pictureType +
                ", template='" + template + '\'' +
                ", layoutSize='" + layoutSize + '\'' +
                ", accountId='" + accountId + '\'' +
                ", materialName='" + materialName + '\'' +
                ", imd='" + imd + '\'' +
                ", modelName='" + modelName + '\'' +
                ", sourceModelName='" + sourceModelName + '\'' +
                ", colorName='" + colorName + '\'' +
                ", pictureName='" + pictureName + '\'' +
                ", companyId=" + companyId +
                ", configFileName='" + configFileName + '\'' +
                ", configType=" + configType +
                ", avoidHole=" + avoidHole +
                ", holePosition='" + holePosition + '\'' +
                ", distributorImageCode='" + distributorImageCode + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", supplierId='" + supplierId + '\'' +
                ", filePath='" + filePath + '\'' +
                ", materialId=" + materialId +
                ", positionName='" + positionName + '\'' +
                ", giftIds='" + giftIds + '\'' +
                ", needPicture=" + needPicture +
                ", frameworkImage='" + frameworkImage + '\'' +
                ", frameworkType='" + frameworkType + '\'' +
                ", frameworkImagePath='" + frameworkImagePath + '\'' +
                ", materialImagePath='" + materialImagePath + '\'' +
                ", setOfPictureType=" + setOfPictureType +
                ", giftCode='" + giftCode + '\'' +
                ", setMode=" + setMode +
                ", productionImagePath='" + productionImagePath + '\'' +
                ", customContentTextArr=" + Arrays.toString(customContentTextArr) +
                ", imageFormat='" + imageFormat + '\'' +
                ", formatSuffix='" + formatSuffix + '\'' +
                '}';
    }

}
