import Caurosel from '@/layout/Caurosel';
import Form from '@/layout/Form';
import { insert } from '@/services/AutorServicer';

// TELA DE CADASTRO DO AUTOR path: /registro/editora

/*
    CRIAR UM SISTEMA DE REGISTRO DE SCHEMAS DE VALIDAÇÃO
    DE INPUTS DE UM FORMULÁRIO. 

    A IDEIA É UTILIZAR O JSON DE CRIAÇÃO DO INPUT PARA DEFINIR
    A REGRAS DE VALIDAÇÃO

    O SCHEMA TERÁ UM ID QUE PROVAVELMENTE SERÁ O NOME E PUXARA PELO ID 
    DE ACORDO COM O SCHEMA
*/

export default function Page() {
    const inputs = [
        {
            name: 'nome',
            label: 'Nome',
            type: 'text',
            placeholder: 'Ex.: Fulano da Silva',
        },
        {
            name: 'email',
            label: 'Email',
            type: 'email',
            placeholder: 'nome@dominio.com',
        },
        {
            name: 'senha',
            label: 'Senha',
            type: 'password',
            placeholder: '',
        },
        {
            name: 'cpf',
            label: 'CPF',
            type: 'text',
            placeholder: 'Ex.: 20.089.005/0001-40',
        },
    ];

    const length: number = inputs.length;

    return (
        <Form.Root action={insert}>
            <Form.Title title={'Se inscreva no Mangafy'} />
            <Caurosel.Body id={'s1'}>
                {inputs.map((input, index: number) => (
                    <Form.Input input={input} key={index} />
                ))}
            </Caurosel.Body>
            <Caurosel.Controls id={'s1'} length={length}>
                <Form.Button
                    names={inputs.map((input) => input.name)}
                    text={'Cadastrar'}
                />
            </Caurosel.Controls>
        </Form.Root>
    );
}
