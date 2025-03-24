interface Schema {
    [key: string]: any;
}

interface Methods {
    [key: string]: (...args: any[]) => boolean;
}

const schemas: Map<string, Schema> = new Map();

export const register = (schema: Schema): void => {
    const keys = Object.keys(schema);
    keys.forEach((key) => {
        const existingSchema = schemas.get(key);
        if (existingSchema) {
            schemas.set(key, { ...existingSchema, ...schema[key] });
        } else {
            schemas.set(key, schema[key]);
        }
    });
};

export const getField = (value: string): Schema | undefined => {
    const schema = schemas.get(value);

    if (schema) return schemas.get(value);

    return undefined;
};

export const useField = (key: string, value: string): boolean => {
    const valids: boolean[] = [];
    const schema: Schema | undefined = schemas.get(key);

    if (schema) {
        const list = schema
            .toString()
            .split('-')
            .filter((item: string) => item.trim() != '');

        list.forEach((item: string) => {
            const match = item.match(/^(\w+)\((.*)\)$/);

            if (match) {
                const methodName = match[1];
                const args = match[2]
                    .split(',')
                    .map((arg: string) => arg.trim())
                    .map((arg: string) =>
                        isNaN(Number(arg)) ? arg : Number(arg)
                    );

                if (methods[methodName])
                    valids.push(methods[methodName](args[0], value));
            } else {
                if (methods[item]) valids.push(methods[item](value));
            }
        });
    }

    return valids.every((bool: boolean) => bool);
};

const isString = (value: string): boolean => {
    return typeof value == 'string';
};

const min = (num: number, value: string): boolean => {
    return value.length >= num;
};

const max = (num: number, value: string): boolean => {
    return value.length <= num;
};

const methods: Methods = {
    min: min,
    max: max,
    isString: isString,
};
