package com.api.aula;

import java.util.ArrayList;
import java.util.Scanner;

public enum UnidadeFederal {
    Rj("Rio de Janeiro"),
    SP("São Paulo"),
    ES("Espirito Santo"),
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
    TO("Tocantins"),
    GO("Goias"),
    AM("Amazonas"),
    AC("Acre"),
    BA("Bahia"),
    CE("Ceará"),
    AP("Amapa"),
    AL("Alagoas");

    private final String unidadeFederal;

    private UnidadeFederal(String unidadeFederal) {
        this.unidadeFederal = unidadeFederal;
    }

    public String getUf() {
        return unidadeFederal;
    }

    public static UnidadeFederal fromString(String estado) {
        for (UnidadeFederal unidadeFederal : UnidadeFederal.values()) {
            if (unidadeFederal.name().equalsIgnoreCase(estado) || unidadeFederal.getUf().equalsIgnoreCase(estado)) {
                return unidadeFederal;

            }
        }
        throw new IllegalArgumentException("Estado não encontrado:" + estado);
    }

    public static void regiao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("região:");
        String regioes = sc.nextLine();
        switch (regioes) {
            case "sul":
                System.out.println(UnidadeFederal.RS.getUf() + "\n" + UnidadeFederal.SC.getUf() + "\n"
                        + UnidadeFederal.PR.getUf());
                break;
            case "centro oeste":
                System.out.println(UnidadeFederal.MS.getUf() + "\n" + UnidadeFederal.RS.getUf() + "\n"
                        + UnidadeFederal.GO.getUf());
                break;
            case "sudeste":
                System.out.println(UnidadeFederal.Rj.getUf() + "\n" + UnidadeFederal.SP.getUf() + "\n"
                        + UnidadeFederal.MG.getUf() + "\n" + UnidadeFederal.ES.getUf());
                break;
            case "nordeste":
                System.out.println(UnidadeFederal.PI.getUf() + "\n" + UnidadeFederal.SE.getUf() + "\n" +
                        UnidadeFederal.BA.getUf() + "\n" + UnidadeFederal.CE.getUf() + "\n" + UnidadeFederal.RN.getUf()
                        + "\n" +
                        UnidadeFederal.SE.getUf() + "\n" + UnidadeFederal.PB.getUf() + "\n" + UnidadeFederal.PE.getUf()
                        + "\n" +
                        UnidadeFederal.AL.getUf());
                break;
            case "norte":
                System.out.println(UnidadeFederal.AC.getUf() + "\n" + UnidadeFederal.AM.getUf() + "\n"
                        + UnidadeFederal.RO.getUf() + "\n" +
                        UnidadeFederal.TO.getUf() + "\n" + UnidadeFederal.PA.getUf() + "\n" + UnidadeFederal.RR.getUf()
                        + "\n" + UnidadeFederal.AP.getUf());
                break;

            default:
                break;
        }
    }
}
