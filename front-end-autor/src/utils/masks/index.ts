'use client';

export const patternCpf = (value: string): string => {
    value = value.replace(/\D/g, '');

    return value.replace(
        /(\d{3})(\d{0,3})(\d{0,3})(\d{0,2})/,
        (_, p1, p2, p3, p4) => {
            return `${p1}${p2 ? '.' + p2 : ''}${p3 ? '.' + p3 : ''}${p4 ? '-' + p4 : ''}`;
        }
    );
};

export const patternCnpj = (value: string): string => {
    value = value.replace(/\D/g, '');

    return value.replace(
        /(\d{2})(\d{0,3})(\d{0,3})(\d{0,4})(\d{0,2})/,
        (_, p1, p2, p3, p4, p5) => {
            return `${p1}${p2 ? '.' + p2 : ''}${p3 ? '.' + p3 : ''}${p4 ? '/' + p4 : ''}${p5 ? '-' + p5 : ''}`;
        }
    );
};
