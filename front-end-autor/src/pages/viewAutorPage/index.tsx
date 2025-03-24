import { ReactNode, Suspense } from 'react';
import { iPublicacao } from '@/services/PublicacaoService/types';
import { insert } from '@/services/PublicacaoService';
import Img from '@/components/Img';
import MenuBarViewAutor from '@/components/MenuBarViewAutor';
import Form from '@/layout/Form';
import List from '@/layout/List';
import Modal from '@/layout/Modal';

import style from './style.module.css';

interface iProps {
    list: iPublicacao[];
}

export default function ViewAutorPage({ list }: iProps) {
    const fallBack: ReactNode = (
        <div className={style.loadMask}>
            <span>Carregando Imagem...</span>
        </div>
    );

    const safeList = Array.isArray(list) ? list : [];

    const formatList = (item: iPublicacao): ReactNode => {
        return (
            <div className={style.card}>
                <div className={style.container}>
                    <Suspense fallback={fallBack}>
                        <Img url={item.imagePath} />
                    </Suspense>
                </div>
                <h3>{item.titulo}</h3>
            </div>
        );
    };

    const inputs = [
        {
            name: 'titulo',
            label: 'Titulo',
            type: 'text',
            placeholder: 'Ex.: 1984',
        },
    ];

    return (
        <div className={style.layout}>
            <MenuBarViewAutor />
            <List.Root>
                <List.Body list={safeList} functionRender={formatList} />
            </List.Root>
            <Modal.Root>
                <Modal.Title title={'Teste'} />
                <Modal.Body>
                    <Form.Root action={insert}>
                        <Form.Input input={inputs[0]} />
                    </Form.Root>
                </Modal.Body>
            </Modal.Root>
        </div>
    );
}
