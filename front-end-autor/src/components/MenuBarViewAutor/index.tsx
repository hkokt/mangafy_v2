'use client';

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faPlus } from '@fortawesome/free-solid-svg-icons';
import { useModalContext } from '@/layout/Modal/context/ModalContext';

import style from './style.module.css';

export default function MenuBarViewAutor() {
    const { setShow } = useModalContext();

    return (
        <section className={style.title} onClick={() => setShow(true)}>
            <FontAwesomeIcon icon={faPlus} size={'2xl'} />
        </section>
    );
}
