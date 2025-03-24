'use server';

import style from './style.module.css';

interface iProps {
    url: string;
}

export default async function Img({ url }: iProps) {
    await new Promise((resolve) => setTimeout(resolve, 500));

    const response: Response = await fetch(`http://localhost:3001${url}`);

    const data = await response.json();

    return <img alt={''} className={style.img} src={data[0].url} />;
}
