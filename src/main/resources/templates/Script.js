function validarPontos() {
        let soma = 0;
        const pontos = parseInt(document.getElementById('pontos').value);
        const atributos = ['inteligencia', 'reflexo', 'habilidade_tecnica','autocontrole','atratividade','sorte','capacidade_de_movimento','tipo_corporal','empatia']

        for(let campo of atributos){
        soma += parseInt(document.getElementById(campo).value);
        }
        if (soma > pontos) {
                        alert('A soma dos atributos não pode ser maior que a quantidade de pontos.');
                        return false;
        }
        return true;

    }
