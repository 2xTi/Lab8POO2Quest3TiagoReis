package org.example;

class VehicleOperation implements VehicleVisitor {
    @Override
    public void visit(Car car) {
        System.out.println("Carro: Cor - " + car.getColor() + ", Marca - " + car.getBrand() + ", Modelo - " + car.getModel());
        System.out.println("Enviar mensagem para o dono do carro: Favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Bus bus) {
        System.out.println("Ônibus: Quantidade de lugares - " + bus.getSeats() + ", Ano de fabricação - " + bus.getYear());
        System.out.println("Enviar mensagem para o dono do ônibus: Atenção para atualização das licenças");
    }

    @Override
    public void visit(Bicycle bicycle) {
        System.out.println("Bicicleta: Cor - " + bicycle.getColor());
        System.out.println("Enviar mensagem para o dono da bicicleta: Comemore no parque o dia do ciclismo");
    }
}
