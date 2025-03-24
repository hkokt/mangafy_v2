import {
    faBuildingColumns,
    faEye,
    faEyeSlash,
    faUser,
} from '@fortawesome/free-solid-svg-icons';
import { patternCnpj, patternCpf } from '@/utils/masks';
import { insert } from '@/services/AutorServicer';
import Caurosel from '@/layout/Caurosel';
import Form from '@/layout/Form';

import style from './style.module.css';

export default function RegisterAutor() {
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
            placeholder: 'Ex.: nome@dominio.com',
        },
        {
            name: 'senha',
            labels: ['Senha', 'Senha'],
            types: ['password', 'text'],
            icons: [faEye, faEyeSlash],
        },
        {
            name: 'cpfAndcnpj',
            labels: ['CPF', 'CNPJ'],
            types: ['text', 'text'],
            icons: [faBuildingColumns, faUser],
            patterns: [patternCpf, patternCnpj],
            limits: [14, 18],
        },
    ];

    const length: number = inputs.length;

    return (
        <section className={style.layout}>
            <article>
                <Form.Root action={insert}>
                    <Form.Title title={'Se inscreva no Mangafy'} />
                    <Caurosel.Body id={'s1'}>
                        <Form.Input input={inputs[0]} />
                        <Form.Input input={inputs[1]} />
                        <Form.ToggleInput input={inputs[2]} />
                        <Form.ToggleInput input={inputs[3]} />
                    </Caurosel.Body>
                    <Caurosel.Controls id={'s1'} length={length}>
                        <Form.Button
                            names={inputs.map((input) => input.name)}
                            text={'Cadastrar'}
                        />
                    </Caurosel.Controls>
                </Form.Root>
            </article>
        </section>
    );
}
