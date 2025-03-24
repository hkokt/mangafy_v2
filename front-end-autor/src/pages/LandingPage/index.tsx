import Link from 'next/link';
import {
    faBookOpen,
    faBuilding,
    faFeather,
} from '@fortawesome/free-solid-svg-icons';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import style from './style.module.css';

export default function LandingPage() {
    return (
        <section className={style.layout}>
            <div>
                <article>
                    <FontAwesomeIcon icon={faBookOpen} size={'2x'} />
                    <div>
                        <span>Já tem acesso? </span>
                        <Link href={'/login'}>Clique aqui</Link>
                    </div>
                </article>
                <article>
                    <h1>Acesse o mangafy for Artists</h1>
                    <p>Nos conte qual é o seu perfil</p>
                    <Link href={'/registro/autor'}>
                        <div>
                            <FontAwesomeIcon icon={faFeather} size={'5x'} />
                            <p>Artista</p>
                        </div>
                    </Link>
                    <Link href={'/registro/editora'}>
                        <div>
                            <FontAwesomeIcon icon={faBuilding} size={'5x'} />
                            <p>Empresa</p>
                        </div>
                    </Link>
                </article>
            </div>
        </section>
    );
}
