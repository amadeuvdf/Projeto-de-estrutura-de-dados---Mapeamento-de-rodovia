class Principal {

    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();
        lista.adicionaNoFim(new rodovia(171,"https://www.google.com/maps/dir/-23.3970133,-46.2925271/"));
        lista.adicionaNoFim(new rodovia(173,"https://www.google.com/maps/dir/-23.3814912,-46.2602403/"));
        lista.adicionaNoFim(new rodovia(175,"https://www.google.com/maps/dir/-23.3896507,-46.2776697/"));
        lista.adicionaNoFim(new rodovia(177,"https://www.google.com/maps/dir/-23.3979528,-46.2952502/"));
        lista.adicionaNoFim(new rodovia(179,"https://www.google.com/maps/dir/-23.4021043,-46.3133198/"));
        lista.adicionaNoFim(new rodovia(181,"https://www.google.com/maps/dir/-23.4053338,-46.3342428/"));
        lista.adicionaNoFim(new rodovia(183,"https://www.google.com/maps/dir/-23.4111216,-46.3509096/"));
        lista.adicionaNoFim(new rodovia(185,"https://www.google.com/maps/dir/-23.4158977,-46.3708739/"));
        lista.adicionaNoFim(new rodovia(187,"https://www.google.com/maps/dir/-23.4198231,-46.3846797/"));
        lista.adicionaNoFim(new rodovia(189,"https://www.google.com/maps/dir/-23.4211852,-46.3896607/"));
        lista.adicionaNoFim(new rodovia(191,"https://www.google.com/maps/dir/-23.4269082,-46.406774/"));
        lista.adicionaNoFim(new rodovia(193,"https://www.google.com/maps/dir/-23.434899,-46.4256559/"));
        lista.adicionaNoFim(new rodovia(195,"https://www.google.com/maps/dir/-23.4418853,-46.4422813/"));
        lista.adicionaNoFim(new rodovia(197,"https://www.google.com/maps/dir/-23.4498922,-46.4613582/"));
        lista.adicionaNoFim(new rodovia(199,"https://www.google.com/maps/dir/-23.4571722,-46.478724/"));
        lista.adicionaNoFim(new rodovia(201,"https://www.google.com/maps/dir/-23.463996,-46.4964178/"));
        lista.adicionaNoFim(new rodovia(203,"https://www.google.com/maps/dir/-23.4708103,-46.5163119/"));
        lista.adicionaNoFim(new rodovia(205,"https://www.google.com/maps/dir/-23.480806,-46.533092/"));
        lista.adicionaNoFim(new rodovia(207,"https://www.google.com/maps/dir/-23.4903424,-46.5480463/"));
        lista.adicionaNoFim(new rodovia(209,"https://www.google.com/maps/dir/-23.501517,-46.564105/"));
        lista.adicionaNoFim(new rodovia(211,"https://www.google.com/maps/dir/-23.5143394,-46.5777157/"));
        lista.adicionaNoFim(new rodovia(213,"https://www.google.com/maps/dir/-23.5261682,-46.5883313/"));
        System.out.println(lista);

        Janela janela = new Janela(lista);
    }
}