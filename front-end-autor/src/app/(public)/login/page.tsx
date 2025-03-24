import Form from '@/layout/Form';

export default function Home() {
    const inputs = [
        {
            name: 'email',
            label: 'Email',
            type: 'email',
            tag: 'input',
            placeholder: 'Ex.: nome@dominio.com',
        },
        {
            name: 'senha',
            label: 'Senha',
            type: 'password',
            tag: 'passwd',
        },
    ];

    return (
        <Form.Root action={''}>
            <Form.Title title={'Login'} />
            {inputs.map((input, index: number) => (
                <Form.Input input={input} key={index} />
            ))}
            <Form.Button
                names={inputs.map((input) => input.name)}
                text={'logar'}
            />
        </Form.Root>
    );
}
