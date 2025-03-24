'use server';

import { getPathEndpoint } from '@/utils/env';

import { iAutor } from './types';

const url: string = `${getPathEndpoint()}/autores`;

export const insert = async (e: FormData): Promise<void> => {
    const value = e.get('cpfAndcnpj')?.toString().replace(/\D/g, '');

    const jsonData: iAutor = {
        nome: String(e.get('nome')),
        email: String(e.get('email')),
        cpf: value?.length == 11 ? value : null,
        cnpj: value?.length == 14 ? value : null,
        senha: String(e.get('senha')),
    };

    try {
        const response = await fetch(url, {
            headers: { 'Content-Type': 'application/json' },
            method: 'POST',
            body: JSON.stringify(jsonData),
        });

        console.log(response.json());
    } catch (error) {
        console.log(error);
    }
};

//revalidateTag('get-all-vagas');
