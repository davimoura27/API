package com.api.aula;

import java.util.ArrayList;
import java.util.Scanner;

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
    TO("Tocantins"),
    GO("Goias");

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
                        + UnidadeFederal.MG.getUf());

            default:
                break;
        }
    }
}
