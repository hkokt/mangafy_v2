'use server';

import { getPathEndpoint } from '@/utils/env';

import type { iPublicacao } from './types';

const url: string = `${getPathEndpoint()}/publicacao`;

export const insert = async (e: FormData): Promise<void> => {
    console.log(e);
};

export const selectAllByAutorId = async (
    idAutor: iPublicacao['id']
): Promise<iPublicacao[]> => {
    try {
        const response: Response = await fetch(`${url}?idAutor=${idAutor}`);
        return response.json();
    } catch (error) {
        console.log(error);
        return [];
    }
};
