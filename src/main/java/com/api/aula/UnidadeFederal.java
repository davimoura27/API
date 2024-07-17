package com.api.aula;

public enum UnidadeFederal {
Rj("Rio de Janeiro"),
SP("São Paulo"),
MG("Minas Gerais"),
MS("Mato Grosso do Sul"),
PA("Pará"), 
PB("Paraiba"),
PR("Parana"),
PE("Pernambuco"),
PI("Piauí"),
RN("Rio Grande do Norte"),
RS("Rio Grande do Sul"),
RO("Rondonia"),
RR("Roraima"),
SC("Santa Catarina"), 
SE("Sergipe"),
TO("Tocantins");


private final String unidadeFederal;
 
private UnidadeFederal(String unidadeFederal){
    this.unidadeFederal = unidadeFederal;
}
public String getUf(){
    return unidadeFederal;
}
public static UnidadeFederal fromString(String estado){
    for(UnidadeFederal unidadeFederal : UnidadeFederal.values()){
        if (unidadeFederal.name().equalsIgnoreCase(estado) || unidadeFederal.getUf().equalsIgnoreCase(estado)) {
            return unidadeFederal;
            
        }
    }
    throw new IllegalArgumentException("Estado não encontrado:" + estado);
}
}
