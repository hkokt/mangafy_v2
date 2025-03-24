export function getPathEndpoint(): string {
    const { TYPE } = process.env;

    if (TYPE == 'dev') return 'http://localhost:3001';

    return '';
}
