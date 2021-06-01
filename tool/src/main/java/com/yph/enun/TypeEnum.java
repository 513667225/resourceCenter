package com.yph.enun;

/**
 * @author Agu
 */
public enum TypeEnum {


    WORD(1,"wordCommission"),IMG(2,"imgCommission"),VIDEO(3,"videoCommission");


    private  Integer typeId;
    private  String  typeColumn;


     TypeEnum(Integer typeId, String typeColumn) {
        this.typeId = typeId;
        this.typeColumn = typeColumn;
    }


    public  static  String getColumn(Integer typeId){
        for (TypeEnum value : values()) {
            if (value.getTypeId().intValue() == typeId.intValue()) {
                return value.getTypeColumn();
            }
        }
        return null;
    }


    public Integer getTypeId() {

        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeColumn() {
        return typeColumn;
    }

    public void setTypeColumn(String typeColumn) {
        this.typeColumn = typeColumn;
    }
}
