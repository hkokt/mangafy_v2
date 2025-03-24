'use server';

import ViewAutorPage from '@/pages/viewAutorPage';
import { selectAllByAutorId } from '@/services/PublicacaoService';

export default async function Page({
    params,
}: {
    params: Promise<{ id: string }>;
}) {
    const { id } = await params;

    const idAutor = Number.parseInt(id);

    const response = await selectAllByAutorId(idAutor);

    return <ViewAutorPage list={response} />;
}
